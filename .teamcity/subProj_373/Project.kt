package subProj_373

import subProj_373.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_373")
    name = "subProj 373"

    buildType(subProj_bt_373_5)
    buildType(subProj_bt_373_2)
    buildType(subProj_bt_373_1)
    buildType(subProj_bt_373_4)
    buildType(subProj_bt_373_3)
    buildType(subProj_bt_373_0)
})
