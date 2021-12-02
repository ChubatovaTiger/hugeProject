package subProj_613

import subProj_613.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_613")
    name = "subProj 613"

    buildType(subProj_bt_613_5)
    buildType(subProj_bt_613_4)
    buildType(subProj_bt_613_1)
    buildType(subProj_bt_613_0)
    buildType(subProj_bt_613_3)
    buildType(subProj_bt_613_2)
})
