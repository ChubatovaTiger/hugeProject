package subProj_1373

import subProj_1373.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1373")
    name = "subProj 1373"

    buildType(subProj_bt_1373_4)
    buildType(subProj_bt_1373_5)
    buildType(subProj_bt_1373_0)
    buildType(subProj_bt_1373_1)
    buildType(subProj_bt_1373_2)
    buildType(subProj_bt_1373_3)
})
