package subProj_343

import subProj_343.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_343")
    name = "subProj 343"

    buildType(subProj_bt_343_2)
    buildType(subProj_bt_343_3)
    buildType(subProj_bt_343_4)
    buildType(subProj_bt_343_5)
    buildType(subProj_bt_343_0)
    buildType(subProj_bt_343_1)
})
