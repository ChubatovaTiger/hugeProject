package subProj_97

import subProj_97.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_97")
    name = "subProj 97"

    buildType(subProj_bt_97_3)
    buildType(subProj_bt_97_2)
    buildType(subProj_bt_97_1)
    buildType(subProj_bt_97_0)
    buildType(subProj_bt_97_5)
    buildType(subProj_bt_97_4)
})
