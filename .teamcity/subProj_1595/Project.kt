package subProj_1595

import subProj_1595.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1595")
    name = "subProj 1595"

    buildType(subProj_bt_1595_1)
    buildType(subProj_bt_1595_0)
    buildType(subProj_bt_1595_3)
    buildType(subProj_bt_1595_2)
    buildType(subProj_bt_1595_5)
    buildType(subProj_bt_1595_4)
})
