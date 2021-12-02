package subProj_1721

import subProj_1721.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1721")
    name = "subProj 1721"

    buildType(subProj_bt_1721_3)
    buildType(subProj_bt_1721_4)
    buildType(subProj_bt_1721_1)
    buildType(subProj_bt_1721_2)
    buildType(subProj_bt_1721_0)
    buildType(subProj_bt_1721_5)
})
