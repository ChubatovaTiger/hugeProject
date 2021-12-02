package subProj_406

import subProj_406.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_406")
    name = "subProj 406"

    buildType(subProj_bt_406_0)
    buildType(subProj_bt_406_1)
    buildType(subProj_bt_406_2)
    buildType(subProj_bt_406_3)
    buildType(subProj_bt_406_4)
    buildType(subProj_bt_406_5)
})
