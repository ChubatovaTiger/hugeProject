package subProj_577

import subProj_577.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_577")
    name = "subProj 577"

    buildType(subProj_bt_577_0)
    buildType(subProj_bt_577_2)
    buildType(subProj_bt_577_1)
    buildType(subProj_bt_577_4)
    buildType(subProj_bt_577_3)
    buildType(subProj_bt_577_5)
})
