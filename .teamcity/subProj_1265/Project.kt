package subProj_1265

import subProj_1265.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1265")
    name = "subProj 1265"

    buildType(subProj_bt_1265_3)
    buildType(subProj_bt_1265_2)
    buildType(subProj_bt_1265_5)
    buildType(subProj_bt_1265_4)
    buildType(subProj_bt_1265_1)
    buildType(subProj_bt_1265_0)
})
