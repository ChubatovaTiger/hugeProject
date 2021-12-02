package subProj_223

import subProj_223.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_223")
    name = "subProj 223"

    buildType(subProj_bt_223_5)
    buildType(subProj_bt_223_2)
    buildType(subProj_bt_223_1)
    buildType(subProj_bt_223_4)
    buildType(subProj_bt_223_3)
    buildType(subProj_bt_223_0)
})
