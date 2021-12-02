package subProj_1391

import subProj_1391.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1391")
    name = "subProj 1391"

    buildType(subProj_bt_1391_1)
    buildType(subProj_bt_1391_0)
    buildType(subProj_bt_1391_3)
    buildType(subProj_bt_1391_2)
    buildType(subProj_bt_1391_5)
    buildType(subProj_bt_1391_4)
})
