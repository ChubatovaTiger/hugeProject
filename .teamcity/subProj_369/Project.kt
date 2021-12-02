package subProj_369

import subProj_369.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_369")
    name = "subProj 369"

    buildType(subProj_bt_369_3)
    buildType(subProj_bt_369_2)
    buildType(subProj_bt_369_5)
    buildType(subProj_bt_369_4)
    buildType(subProj_bt_369_1)
    buildType(subProj_bt_369_0)
})
