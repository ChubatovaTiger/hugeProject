package subProj_1309

import subProj_1309.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1309")
    name = "subProj 1309"

    buildType(subProj_bt_1309_4)
    buildType(subProj_bt_1309_3)
    buildType(subProj_bt_1309_5)
    buildType(subProj_bt_1309_0)
    buildType(subProj_bt_1309_2)
    buildType(subProj_bt_1309_1)
})
