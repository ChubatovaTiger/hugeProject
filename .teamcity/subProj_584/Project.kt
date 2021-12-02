package subProj_584

import subProj_584.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_584")
    name = "subProj 584"

    buildType(subProj_bt_584_5)
    buildType(subProj_bt_584_3)
    buildType(subProj_bt_584_4)
    buildType(subProj_bt_584_1)
    buildType(subProj_bt_584_2)
    buildType(subProj_bt_584_0)
})
