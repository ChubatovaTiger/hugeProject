package subProj_1569

import subProj_1569.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1569")
    name = "subProj 1569"

    buildType(subProj_bt_1569_3)
    buildType(subProj_bt_1569_4)
    buildType(subProj_bt_1569_5)
    buildType(subProj_bt_1569_0)
    buildType(subProj_bt_1569_1)
    buildType(subProj_bt_1569_2)
})
