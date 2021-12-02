package subProj_1173

import subProj_1173.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1173")
    name = "subProj 1173"

    buildType(subProj_bt_1173_2)
    buildType(subProj_bt_1173_3)
    buildType(subProj_bt_1173_4)
    buildType(subProj_bt_1173_5)
    buildType(subProj_bt_1173_0)
    buildType(subProj_bt_1173_1)
})
