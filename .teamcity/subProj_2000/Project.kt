package subProj_2000

import subProj_2000.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_2000")
    name = "subProj 2000"

    buildType(subProj_bt_2000_5)
    buildType(subProj_bt_2000_4)
    buildType(subProj_bt_2000_3)
    buildType(subProj_bt_2000_2)
    buildType(subProj_bt_2000_1)
    buildType(subProj_bt_2000_0)
})
