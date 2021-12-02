package subProj_371

import subProj_371.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_371")
    name = "subProj 371"

    buildType(subProj_bt_371_4)
    buildType(subProj_bt_371_3)
    buildType(subProj_bt_371_5)
    buildType(subProj_bt_371_0)
    buildType(subProj_bt_371_2)
    buildType(subProj_bt_371_1)
})
