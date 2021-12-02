package subProj_1088

import subProj_1088.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1088")
    name = "subProj 1088"

    buildType(subProj_bt_1088_5)
    buildType(subProj_bt_1088_3)
    buildType(subProj_bt_1088_4)
    buildType(subProj_bt_1088_1)
    buildType(subProj_bt_1088_2)
    buildType(subProj_bt_1088_0)
})
