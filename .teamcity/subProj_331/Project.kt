package subProj_331

import subProj_331.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_331")
    name = "subProj 331"

    buildType(subProj_bt_331_5)
    buildType(subProj_bt_331_4)
    buildType(subProj_bt_331_3)
    buildType(subProj_bt_331_2)
    buildType(subProj_bt_331_1)
    buildType(subProj_bt_331_0)
})
