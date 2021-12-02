package subProj_488

import subProj_488.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_488")
    name = "subProj 488"

    buildType(subProj_bt_488_4)
    buildType(subProj_bt_488_5)
    buildType(subProj_bt_488_0)
    buildType(subProj_bt_488_1)
    buildType(subProj_bt_488_2)
    buildType(subProj_bt_488_3)
})
