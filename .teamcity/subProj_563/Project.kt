package subProj_563

import subProj_563.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_563")
    name = "subProj 563"

    buildType(subProj_bt_563_3)
    buildType(subProj_bt_563_2)
    buildType(subProj_bt_563_5)
    buildType(subProj_bt_563_4)
    buildType(subProj_bt_563_1)
    buildType(subProj_bt_563_0)
})
