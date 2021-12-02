package subProj_1000

import subProj_1000.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1000")
    name = "subProj 1000"

    buildType(subProj_bt_1000_5)
    buildType(subProj_bt_1000_3)
    buildType(subProj_bt_1000_4)
    buildType(subProj_bt_1000_1)
    buildType(subProj_bt_1000_2)
    buildType(subProj_bt_1000_0)
})
