package subProj_409

import subProj_409.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_409")
    name = "subProj 409"

    buildType(subProj_bt_409_0)
    buildType(subProj_bt_409_1)
    buildType(subProj_bt_409_2)
    buildType(subProj_bt_409_3)
    buildType(subProj_bt_409_4)
    buildType(subProj_bt_409_5)
})
