package subProj_476

import subProj_476.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_476")
    name = "subProj 476"

    buildType(subProj_bt_476_4)
    buildType(subProj_bt_476_3)
    buildType(subProj_bt_476_2)
    buildType(subProj_bt_476_1)
    buildType(subProj_bt_476_5)
    buildType(subProj_bt_476_0)
})
