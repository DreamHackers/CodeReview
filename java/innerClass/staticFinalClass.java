// インナークラスのアクセス修飾子について
// メソッドの戻り値にMapを使っていたところ、
// Keyの指定がヤバイ、Nullチェックがしにくいとかの理由でインナークラスを使うことになった

    public class DrCount {
        private final int uniqueSystemCount;
        private final int uniqueDcfDrCdCount;
        
        public DrCount(final int uniqueSystemCount, final int uniqueDcfDrCdCount) {
            this.uniqueSystemCount = uniqueSystemCount;
            this.uniqueDcfDrCdCount = uniqueDcfDrCdCount;
        }
        
        public int getUniqueSystemCount() {
            return uniqueSystemCount;
        }
        public int getUniqueDcfDrCdCount() {
            return uniqueDcfDrCdCount;
        }
    }
