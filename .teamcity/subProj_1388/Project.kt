package subProj_1388

import subProj_1388.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1388")
    name = "subProj 1388"

    buildType(subProj_bt_1388_0)
    buildType(subProj_bt_1388_1)
    buildType(subProj_bt_1388_2)
    buildType(subProj_bt_1388_3)
    buildType(subProj_bt_1388_4)
    buildType(subProj_bt_1388_5)
})
