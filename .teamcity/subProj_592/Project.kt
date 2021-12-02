package subProj_592

import subProj_592.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_592")
    name = "subProj 592"

    buildType(subProj_bt_592_0)
    buildType(subProj_bt_592_1)
    buildType(subProj_bt_592_4)
    buildType(subProj_bt_592_5)
    buildType(subProj_bt_592_2)
    buildType(subProj_bt_592_3)
})
