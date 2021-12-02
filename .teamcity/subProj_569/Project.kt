package subProj_569

import subProj_569.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_569")
    name = "subProj 569"

    buildType(subProj_bt_569_1)
    buildType(subProj_bt_569_0)
    buildType(subProj_bt_569_3)
    buildType(subProj_bt_569_2)
    buildType(subProj_bt_569_5)
    buildType(subProj_bt_569_4)
})
