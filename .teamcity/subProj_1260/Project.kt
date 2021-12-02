package subProj_1260

import subProj_1260.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1260")
    name = "subProj 1260"

    buildType(subProj_bt_1260_0)
    buildType(subProj_bt_1260_2)
    buildType(subProj_bt_1260_1)
    buildType(subProj_bt_1260_4)
    buildType(subProj_bt_1260_3)
    buildType(subProj_bt_1260_5)
})
