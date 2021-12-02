package subProj_721

import subProj_721.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_721")
    name = "subProj 721"

    buildType(subProj_bt_721_1)
    buildType(subProj_bt_721_0)
    buildType(subProj_bt_721_5)
    buildType(subProj_bt_721_4)
    buildType(subProj_bt_721_3)
    buildType(subProj_bt_721_2)
})
