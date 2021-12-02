package subProj_970

import subProj_970.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_970")
    name = "subProj 970"

    buildType(subProj_bt_970_1)
    buildType(subProj_bt_970_0)
    buildType(subProj_bt_970_3)
    buildType(subProj_bt_970_2)
    buildType(subProj_bt_970_5)
    buildType(subProj_bt_970_4)
})
