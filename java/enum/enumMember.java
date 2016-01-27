// かっこいいEnumの活用

	public enum FileType {
        SystemCd("sys", 10),
        DcfDrCd("dcf", 6);
        public final String paramName;
        public final int cdLength;
        private FileType(final String paramName, final int cdLength) {
            this.paramName = paramName;
            this.cdLength = cdLength;
        }
        public static Optional<FileType> paramNameOf(final String paramName) {
            return Stream.of(values()).filter(f -> f.paramName.equals(paramName)).findAny();
        }
    }

// enumはこんなに拡張できる（Javaのみらしい）
// 以下サンプル

// fileTypeで与えられた文字列が定義されてるかどうかを一撃で判定できる
final String fileType = "hoge";
if (!FileType.paramNameOf(fileType).isPresent())

// enumの各項目に紐づく値を取れる
FileType filetype = FileType.SystemCd;
fileType.cdLength;
