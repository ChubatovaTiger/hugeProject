package subProj_887

import subProj_887.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_887")
    name = "subProj 887"

    buildType(subProj_bt_887_5)
    buildType(subProj_bt_887_1)
    buildType(subProj_bt_887_2)
    buildType(subProj_bt_887_3)
    buildType(subProj_bt_887_4)
    buildType(subProj_bt_887_0)
})
