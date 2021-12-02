package subProj_469

import subProj_469.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_469")
    name = "subProj 469"

    buildType(subProj_bt_469_0)
    buildType(subProj_bt_469_4)
    buildType(subProj_bt_469_3)
    buildType(subProj_bt_469_2)
    buildType(subProj_bt_469_1)
    buildType(subProj_bt_469_5)
})
