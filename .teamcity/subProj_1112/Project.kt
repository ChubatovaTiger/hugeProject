package subProj_1112

import subProj_1112.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1112")
    name = "subProj 1112"

    buildType(subProj_bt_1112_2)
    buildType(subProj_bt_1112_1)
    buildType(subProj_bt_1112_4)
    buildType(subProj_bt_1112_3)
    buildType(subProj_bt_1112_5)
    buildType(subProj_bt_1112_0)
})
