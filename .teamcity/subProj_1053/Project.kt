package subProj_1053

import subProj_1053.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1053")
    name = "subProj 1053"

    buildType(subProj_bt_1053_5)
    buildType(subProj_bt_1053_2)
    buildType(subProj_bt_1053_1)
    buildType(subProj_bt_1053_4)
    buildType(subProj_bt_1053_3)
    buildType(subProj_bt_1053_0)
})
