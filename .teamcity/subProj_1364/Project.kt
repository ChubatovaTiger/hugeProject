package subProj_1364

import subProj_1364.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1364")
    name = "subProj 1364"

    buildType(subProj_bt_1364_1)
    buildType(subProj_bt_1364_0)
    buildType(subProj_bt_1364_5)
    buildType(subProj_bt_1364_4)
    buildType(subProj_bt_1364_3)
    buildType(subProj_bt_1364_2)
})
