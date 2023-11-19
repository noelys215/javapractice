public class MainChallenge {
    public class PaintJob {

        // Private helper method to calculate the bucket count
        private static int calculateBuckets(double area, double areaPerBucket) {
            return (int) Math.ceil(area / areaPerBucket);
        }

        public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
            if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;
            return calculateBuckets(width * height, areaPerBucket) - extraBuckets;
        }

        public static int getBucketCount(double width, double height, double areaPerBucket) {
            if (width <= 0 || height <= 0 || areaPerBucket <= 0) return -1;
            return calculateBuckets(width * height, areaPerBucket);
        }

        public static int getBucketCount(double area, double areaPerBucket) {
            if (area <= 0 || areaPerBucket <= 0) return -1;
            return calculateBuckets(area, areaPerBucket);
        }
    }


}
