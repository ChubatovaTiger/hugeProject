package subProj_268

import subProj_268.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_268")
    name = "subProj 268"

    buildType(subProj_bt_268_4)
    buildType(subProj_bt_268_5)
    buildType(subProj_bt_268_2)
    buildType(subProj_bt_268_3)
    buildType(subProj_bt_268_0)
    buildType(subProj_bt_268_1)
})
