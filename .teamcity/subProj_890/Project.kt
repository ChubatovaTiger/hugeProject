package subProj_890

import subProj_890.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_890")
    name = "subProj 890"

    buildType(subProj_bt_890_1)
    buildType(subProj_bt_890_2)
    buildType(subProj_bt_890_3)
    buildType(subProj_bt_890_4)
    buildType(subProj_bt_890_0)
    buildType(subProj_bt_890_5)
})
