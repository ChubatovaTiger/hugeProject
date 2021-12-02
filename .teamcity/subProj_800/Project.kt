package subProj_800

import subProj_800.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_800")
    name = "subProj 800"

    buildType(subProj_bt_800_4)
    buildType(subProj_bt_800_5)
    buildType(subProj_bt_800_0)
    buildType(subProj_bt_800_1)
    buildType(subProj_bt_800_2)
    buildType(subProj_bt_800_3)
})
