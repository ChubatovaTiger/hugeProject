package subProj_586

import subProj_586.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_586")
    name = "subProj 586"

    buildType(subProj_bt_586_3)
    buildType(subProj_bt_586_4)
    buildType(subProj_bt_586_1)
    buildType(subProj_bt_586_2)
    buildType(subProj_bt_586_5)
    buildType(subProj_bt_586_0)
})
