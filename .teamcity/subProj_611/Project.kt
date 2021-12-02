package subProj_611

import subProj_611.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_611")
    name = "subProj 611"

    buildType(subProj_bt_611_2)
    buildType(subProj_bt_611_3)
    buildType(subProj_bt_611_4)
    buildType(subProj_bt_611_5)
    buildType(subProj_bt_611_0)
    buildType(subProj_bt_611_1)
})
