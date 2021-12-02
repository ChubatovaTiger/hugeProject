package subProj_923

import subProj_923.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_923")
    name = "subProj 923"

    buildType(subProj_bt_923_1)
    buildType(subProj_bt_923_0)
    buildType(subProj_bt_923_5)
    buildType(subProj_bt_923_4)
    buildType(subProj_bt_923_3)
    buildType(subProj_bt_923_2)
})
