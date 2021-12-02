package subProj_1179

import subProj_1179.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1179")
    name = "subProj 1179"

    buildType(subProj_bt_1179_4)
    buildType(subProj_bt_1179_5)
    buildType(subProj_bt_1179_0)
    buildType(subProj_bt_1179_1)
    buildType(subProj_bt_1179_2)
    buildType(subProj_bt_1179_3)
})
