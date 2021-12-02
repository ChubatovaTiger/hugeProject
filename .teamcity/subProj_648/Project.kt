package subProj_648

import subProj_648.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_648")
    name = "subProj 648"

    buildType(subProj_bt_648_4)
    buildType(subProj_bt_648_5)
    buildType(subProj_bt_648_2)
    buildType(subProj_bt_648_3)
    buildType(subProj_bt_648_0)
    buildType(subProj_bt_648_1)
})
