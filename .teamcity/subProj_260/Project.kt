package subProj_260

import subProj_260.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_260")
    name = "subProj 260"

    buildType(subProj_bt_260_4)
    buildType(subProj_bt_260_5)
    buildType(subProj_bt_260_2)
    buildType(subProj_bt_260_3)
    buildType(subProj_bt_260_0)
    buildType(subProj_bt_260_1)
})
