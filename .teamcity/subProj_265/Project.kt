package subProj_265

import subProj_265.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_265")
    name = "subProj 265"

    buildType(subProj_bt_265_5)
    buildType(subProj_bt_265_3)
    buildType(subProj_bt_265_4)
    buildType(subProj_bt_265_1)
    buildType(subProj_bt_265_2)
    buildType(subProj_bt_265_0)
})
