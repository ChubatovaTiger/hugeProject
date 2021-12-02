package subProj_1274

import subProj_1274.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1274")
    name = "subProj 1274"

    buildType(subProj_bt_1274_4)
    buildType(subProj_bt_1274_5)
    buildType(subProj_bt_1274_2)
    buildType(subProj_bt_1274_3)
    buildType(subProj_bt_1274_0)
    buildType(subProj_bt_1274_1)
})
