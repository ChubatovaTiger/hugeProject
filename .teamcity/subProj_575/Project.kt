package subProj_575

import subProj_575.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_575")
    name = "subProj 575"

    buildType(subProj_bt_575_2)
    buildType(subProj_bt_575_1)
    buildType(subProj_bt_575_4)
    buildType(subProj_bt_575_3)
    buildType(subProj_bt_575_5)
    buildType(subProj_bt_575_0)
})
