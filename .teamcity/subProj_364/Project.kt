package subProj_364

import subProj_364.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_364")
    name = "subProj 364"

    buildType(subProj_bt_364_4)
    buildType(subProj_bt_364_3)
    buildType(subProj_bt_364_5)
    buildType(subProj_bt_364_0)
    buildType(subProj_bt_364_2)
    buildType(subProj_bt_364_1)
})
