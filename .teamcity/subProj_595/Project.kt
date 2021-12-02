package subProj_595

import subProj_595.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_595")
    name = "subProj 595"

    buildType(subProj_bt_595_5)
    buildType(subProj_bt_595_3)
    buildType(subProj_bt_595_4)
    buildType(subProj_bt_595_1)
    buildType(subProj_bt_595_2)
    buildType(subProj_bt_595_0)
})
