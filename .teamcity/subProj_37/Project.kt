package subProj_37

import subProj_37.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_37")
    name = "subProj 37"

    buildType(subProj_bt_37_0)
    buildType(subProj_bt_37_1)
    buildType(subProj_bt_37_2)
    buildType(subProj_bt_37_3)
    buildType(subProj_bt_37_4)
    buildType(subProj_bt_37_5)
})
